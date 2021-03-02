import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-categoria`
 *
 * VistaCategoria element.
 *
 * @customElement
 * @polymer
 */
class VistaCategoria extends PolymerElement {

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
        return 'vista-categoria';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCategoria.is, VistaCategoria);
