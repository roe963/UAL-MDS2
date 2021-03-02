import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-productocliente`
 *
 * VistaProductocliente element.
 *
 * @customElement
 * @polymer
 */
class VistaProductocliente extends PolymerElement {

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
        return 'vista-productocliente';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductocliente.is, VistaProductocliente);
