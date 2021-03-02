import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-verpedido`
 *
 * VistaVerpedido element.
 *
 * @customElement
 * @polymer
 */
class VistaVerpedido extends PolymerElement {

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
        return 'vista-verpedido';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVerpedido.is, VistaVerpedido);
