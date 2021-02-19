import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-catalogo`
 *
 * VistaCatalogo element.
 *
 * @customElement
 * @polymer
 */
class VistaCatalogo extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-catalogo';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCatalogo.is, VistaCatalogo);
